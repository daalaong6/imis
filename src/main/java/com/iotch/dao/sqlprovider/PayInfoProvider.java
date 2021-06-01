package com.iotch.dao.sqlprovider;

import java.util.Map;

public class PayInfoProvider {

    /**
     *查询条件样例sql如下
     SELECT
     devId,
     payType,
     SUM(totalMoney) AS payableAmount,
     SUM(unioninfo - IFNULL(changeMoney, 0)) AS income,
     '2018-05-01 23:59:59 TO 2018-06-05 23:59:59' AS 'payTime',
     '2018-05-01 23:59:59 TO 2018-06-05 23:59:59' AS 'createTime'
     FROM
     pay_info
     WHERE
     payFlag = '支付'
     AND
     payType = '微信/支付宝'
     AND
     devId = 'A12'
     AND
     payTime >= '2018-05-01 23:59:59'
     AND
     payTime <= '2018-06-05 23:59:59'
     AND
     createTime >= '2018-05-01 23:59:59'
     AND
     createTime <= '2018-06-05 23:59:59'
     GROUP BY devId,payType

     * @return
     */
    public String selectIncomeByMapConditon(Map params){
        String sql = "SELECT devId,SUM(totalMoney) AS payableAmount,SUM(unioninfo - IFNULL(changeMoney,0)) AS income,'2018-05-02 23:59:59 TO 2018-06-05 23:59:59' AS 'payTime','2018-05-02 23:59:59 TO 2018-06-05 23:59:59' AS 'createTime' FROM pay_info WHERE payFlag";
        StringBuffer stringBuffer = new StringBuffer("SELECT devId,payType,SUM(totalMoney) AS payableAmount,SUM(unioninfo - IFNULL(changeMoney, 0)) AS income,");
        stringBuffer.append("'2018-05-01 23:59:59 TO 2018-06-05 23:59:59' AS 'payTime','2018-05-01 23:59:59 TO 2018-06-05 23:59:59' AS 'createTime'");
        stringBuffer.append(" FROM pay_info WHERE payFlag = '支付' ");
        stringBuffer.append(" AND ");
        return null;
    }
}
