package com.fr.report;

import com.fr.base.Parameter;
import com.fr.data.AbstractTableData;
import com.justonetech.biz.manager.JdRecordManager;
import com.justonetech.biz.utils.Constants;
import com.justonetech.core.utils.JspHelper;
import com.justonetech.system.utils.SpringContextUtil;

import java.util.List;

/**
 * note:
 * User: Shaxj
 * Date: 14-9-16
 * Time: 下午4:20
 */
public class WorkerTalkFormPrint extends AbstractTableData {


    // 列名数组，保存程序数据集所有列名
    private String[] columnNames = null;
    // 定义程序数据集的列数量
    private int columnNum = 1;
    // 保存查询表的实际列数量
    private int colNum = 0;
    // 保存查询得到列值
    private List valueList = null;

    // 构造函数，定义表结构，该表有10个数据列，列名为column#0，column#1，。。。。。。column#9
    public WorkerTalkFormPrint() {
        // 定义tableName参数
        this.parameters = new Parameter[]{new Parameter("id")};

        // 定义程序数据集列名
        columnNames = new String[]{
                "携带材料",
                "day"
        };
        columnNum = columnNames.length;
        colNum = columnNum;
    }

    // 实现其他四个方法
    public int getColumnCount() {
        return columnNum;
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public int getRowCount() {
        init();
        return valueList.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        init();
        if (columnIndex >= colNum) {
            return null;
        }
        return ((Object[]) valueList.get(rowIndex))[columnIndex];
    }

    // 准备数据
    public void init() {
        // 确保只被执行一次
        if (valueList != null) {
            return;
        }
        // 保存得到的数据库表名
        String id = parameters[0].getValue().toString();
        JdRecordManager jdRecordManager = (JdRecordManager) SpringContextUtil.getBean("jdRecordManager");

        valueList = jdRecordManager.getMaterialIds(JspHelper.getLong(id));
    }

    // 释放一些资源，因为可能会有重复调用，所以需释放valueList，将上次查询的结果释放掉
    public void release() throws Exception {
        super.release();
        this.valueList = null;
    }

}
