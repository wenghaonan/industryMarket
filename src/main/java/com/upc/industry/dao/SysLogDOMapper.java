package com.upc.industry.dao;

import com.upc.industry.dataobject.SysLogDO;

public interface SysLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    int insert(SysLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    int insertSelective(SysLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    SysLogDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    int updateByPrimaryKeySelective(SysLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Tue Jul 21 10:06:03 CST 2020
     */
    int updateByPrimaryKey(SysLogDO record);
}