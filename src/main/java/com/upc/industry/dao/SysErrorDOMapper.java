package com.upc.industry.dao;

import com.upc.industry.dataobject.SysErrorDO;

public interface SysErrorDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    int insert(SysErrorDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    int insertSelective(SysErrorDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    SysErrorDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    int updateByPrimaryKeySelective(SysErrorDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_error
     *
     * @mbg.generated Tue Jul 21 15:07:24 CST 2020
     */
    int updateByPrimaryKey(SysErrorDO record);
}