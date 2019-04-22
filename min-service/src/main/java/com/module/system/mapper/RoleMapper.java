package com.module.system.mapper;

import com.module.system.domain.Role;

import java.util.Set;

public interface RoleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Role record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Role record);

    /**
     *
     * @mbggenerated
     */
    Role selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Role record);

    Set<Role> findByUserMenuAndRole(Long id);

    Set<Role> findByIdReturnList(Long id);
}