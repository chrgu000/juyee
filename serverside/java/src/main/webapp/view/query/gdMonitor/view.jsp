<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script language="JavaScript">
    //登录
    function gotologin(config) {
        //      username = :ebtest",
//      password = :11111",
        config = $.extend({
            serverIp:"116.229.239.52",
            port:"10000",
            loginName:"pinganbs",
            loginPassword:"123456"}, config);

        player.SetContextMenuMode(4);
        return player.Login(config.serverIp, config.port, config.loginName, config.loginPassword);
    }
    //抬头列表
    function gotogetlist() {
        //获取设备列表通过异步消息返回 解析列表并展示，这里没有具体举例
        document.getElementById("player").GetDeviceList();
    }
    //播放
    var globalGuid = "";
    function gotoplay(guid) {
//            return;
//            210202010500194401|106路上海火车站北广场
//            210202010500292801|15路上海体育馆
//            210201010500463802|东塔吊外侧
//            210201010500463801|西塔吊
//            210201010500463803|西塔吊外侧
//            var guid = "210202010500292801";
//            var guid = document.getElementById("videoList").value;
        if (guid == null) {
//                guid = "210202010500292801";
            guid = "210201010500080001";
//                alert("没有选择摄像头！");
//                return;
        }
        $.getJSON("${ctx}/projectQuery/getMonitorServiceByGuid.do", {guid:guid}, function (config) {
            //这里的guid应该是解析获取列表的异步事件从列表中获取guid
            var loginResult = gotologin(config);
            if (loginResult == 200 || loginResult == 500) {
                document.getElementById("player").OpenGUStreamEx(guid, 1, 0);
                var currNode = global_zTree.getSelectedNodes()[0];
                var icons = icon.split(",");
                currNode.icon = currNode.icon.substring(0, currNode.icon.lastIndexOf("/") + 1) + icons[2];
                global_zTree.updateNode(currNode);
                globalGuid = guid;
            }
        });
    }
    function goptz(type) {
//            document.getElementById("player").SendPTZControlTCP(guid, type)
        var player = document.getElementById("player");
        var ptzstep = 200;
        player.SetPTZStepValue(ptzstep);
        if (type < 5) {
            var step = 200;    //摄像头旋转角度步长
            player.SetPTZRotateStepValue(step);
        }

        var returnValue = player.SendPTZControlTCP(globalGuid, type);
        if (returnValue == 102) {
            alert("当前用户权限不足");
        }
    }
    var sDeviceList;

    function changeScreen(type) {
        var player = document.getElementById("player");
        var returnValue = player.GetFullScreen();
        if (type == 0) {
            if (returnValue == 0) {
                player.SetFullScreen(2);
            } else {
                player.SetFullScreen(0);
            }
        } else if (type > 0) {
            if (player.GetDivMode() != type) {
                player.SetDivMode(type);
            }
        }
    }

    function changePic(flag, isdown) {
        var pics = ["left.jpg", "right.jpg", "up.jpg", "down.jpg"];
        if (!isdown) {
            $("#opImage").attr("src", "${themePath}/img/control.jpg");
        } else {
            $("#opImage").attr("src", "${themePath}/img/" + pics[flag - 1]);
        }
    }
</script>
<script language="JavaScript" FOR="player" event="DeviceListReturn(nStatusCode,sDeviceList)">
    //    function DeviceListReturn(nStatusCode,sDeviceList)
    {
        //异步加载
//            document.getElementsByName("deviceList")[0].value = sDeviceList;
        initializeSelect(sDeviceList);
    }
</script>
<script type='text/javascript'>
    loadXML = function (xmlString) {
        var xmlDoc = null;
        //判断浏览器的类型
        //支持IE浏览器
        if (!window.DOMParser && window.ActiveXObject) {   //window.DOMParser 判断是否是非ie浏览器
            var xmlDomVersions = ['MSXML.2.DOMDocument.6.0', 'MSXML.2.DOMDocument.3.0', 'Microsoft.XMLDOM'];
            for (var i = 0; i < xmlDomVersions.length; i++) {
                try {
                    xmlDoc = new ActiveXObject(xmlDomVersions[i]);
                    xmlDoc.async = false;
                    xmlDoc.loadXML(xmlString); //loadXML方法载入xml字符串
                    break;
                } catch (e) {
                }
            }
        }
        //支持Mozilla浏览器
        else if (window.DOMParser && document.implementation && document.implementation.createDocument) {
            try {
                /* DOMParser 对象解析 XML 文本并返回一个 XML Document 对象。
                 * 要使用 DOMParser，使用不带参数的构造函数来实例化它，然后调用其 parseFromString() 方法
                 * parseFromString(text, contentType) 参数text:要解析的 XML 标记 参数contentType文本的内容类型
                 * 可能是 "text/xml" 、"application/xml" 或 "application/xhtml+xml" 中的一个。注意，不支持 "text/html"。
                 */
                domParser = new DOMParser();
                xmlDoc = domParser.parseFromString(xmlString, 'text/xml');
            } catch (e) {
            }
        }
        else {
            return null;
        }

        return xmlDoc;
    }

    //对xml对象进行判断
    checkXMLDocObj = function (xmlString) {
        var xmlDoc = loadXML(xmlString);
        if (xmlDoc == null) {
            alert('您的浏览器不支持xml文件读取,于是本页面禁止您的操作,推荐使用IE5.0以上可以解决此问题!');
            //window.location.href='某某地址(比如首页)';
        }
        return xmlDoc;
    }

    //初始化加载摄像头列表
    initializeSelect = function (xmlstr) {
        gotoplay();
    };
</script>
<style type="text/css">
    .form_table {
        line-height: 30px;
    }
</style>
<div class="form_div" align="center" style="background-color:#333;">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" style="background-color: #333;">
        <tr>
            <td style="background-color:black;">
                <OBJECT id="player" CLASSID="clsid:AB70953C-CD32-4CE0-BEA8-07365E319C2B" width="600"
                        height="460"></OBJECT>
            </td>
            <td width="270" valign="top">
                <table width="270" border="0" cellpadding="0" cellspacing="0">
                    <tr style="background:url(${themePath}/img/title.jpg) repeat-x;color:#fff">
                        <td height="20">云台控制</td>
                    </tr>
                    <tr>
                        <td height="135">
                            <img src="${themePath}/img/control.jpg" id="opImage" usemap="#opImage" style="float: left"/>
                            <img src="${themePath}/img/control3.jpg" id="opImage3" usemap="#opImage3"
                                 style="float: left"/>
                            <map name="opImage">
                                <area alt="上" id="up" shape="poly" coords="25,20,67.5,67.5,120,20,67.5,8"
                                      onclick="goptz(3)"
                                      onmousedown="changePic(3,true)" onmouseup="changePic(3,false)">
                                <area alt="左" id="left" shape="poly" coords="25,20,67.5,67.5,25,100,8,67.5"
                                      onclick="goptz(1)"
                                      onmousedown="changePic(1,true)" onmouseup="changePic(1,false)">
                                <area alt="下" id="right" shape="poly" coords="25,100,67.5,67.5,120,115,67.5,127"
                                      onclick="goptz(4)"
                                      onmousedown="changePic(4,true)" onmouseup="changePic(4,false)">
                                <area alt="右" id="down" shape="poly" coords="120,115,67.5,67.5,120,20,127,67.5"
                                      onclick="goptz(2)"
                                      onmousedown="changePic(2,true)" onmouseup="changePic(2,false)">

                            </map>
                            <map name="opImage3">
                                <area alt="切换屏" shape="poly" coords="20,30,20,55,72,55,72,30" onclick="changeScreen(0)"
                                      style="cursor: pointer">
                                <area alt="1分屏" shape="poly" coords="20,70,20,95,72,95,72,70" onclick="changeScreen(1)">
                                <area alt="4分屏" shape="poly" coords="75,30,75,55,117,55,117,30"
                                      onclick="changeScreen(4)">
                                <area alt="9分屏" shape="poly" coords="75,70,75,95,117,95,117,70"
                                      onclick="changeScreen(9)">
                            </map>
                        </td>
                    </tr>
                    <tr>
                        <td height="44">
                            <img src="${themePath}/img/control2.jpg" usemap="#opImage4" style="float: left"/>
                            <map name="opImage4">
                                <area alt="放大" shape="poly" coords="15,12,15,40,65,40,65,12" onclick="goptz(5)">
                                <area alt="缩小" shape="poly" coords="80,12,80,40,130,40,130,12" onclick="goptz(6)">
                                <area alt="调亮" shape="poly" coords="145,12,145,40,195,40,195,12" onclick="goptz(7)">
                                <area alt="调暗" shape="poly" coords="210,12,210,40,260,40,260,12" onclick="goptz(8)">
                            </map>
                        </td>
                    </tr>
                    <tr style="background:url(${themePath}/img/title.jpg) repeat-x;color:#fff">
                        <td height="20" colspan="4">
                            <b>项目信息</b>
                        </td>
                    </tr>
                    <tr>
                        <td height="220" valign="top" style="color:#ffffff;padding-left:20px;background-color:#333"
                            align="left">
                            <table cellpadding="0" cellspacing="0" class="form_table" border="0">
                                <tr>
                                    <td width="30%" nowrap="nowrap" align="right">工程名称：</td>
                                    <td width="70%" colspan="3" align="left" id="projectName">
                                        &nbsp;${project.data.projectName}</td>
                                </tr>
                                <tr>
                                    <td nowrap="nowrap" align="right">工程属地：</td>
                                    <td align="left" id="belongArea">&nbsp;${project.belongArea}</td>
                                </tr>
                                <tr>
                                    <td align="right">施工单位：</td>
                                    <td colspan="3" align="left" id="sgTotalUnitName">&nbsp;${gd.sgTotalUnitName}</td>
                                </tr>
                                <tr>
                                    <td nowrap="nowrap" align="right">工程性质：</td>
                                    <td align="left" id="property">&nbsp;${project.property}</td>
                                </tr>
                                <tr>
                                    <td align="right">建设单位：</td>
                                    <td colspan="3" align="left" id="buildUnitName">
                                        &nbsp;${project.data.buildUnitName}</td>
                                </tr>
                                <tr>
                                    <td nowrap="nowrap" align="right">项目负责人：</td>
                                    <td align="left">&nbsp;</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr style="background:url(${themePath}/img/title.jpg) repeat-x;color:#fff;background-color: #333;">
                        <td height="20" colspan="4">
                            视频播放插件：<a href="${ctx}/tools/setup_video.exe" target="_blank"><font
                                color="white">【下载】</font></a>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</div>