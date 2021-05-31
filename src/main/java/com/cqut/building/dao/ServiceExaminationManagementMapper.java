package com.cqut.building.dao;

import com.cqut.building.dto.GetExaminationManagementByIdDto;
import com.cqut.building.dto.GetServiceExaminationManagementDto;
import com.cqut.building.entity.ServiceExaminationManagement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

@Mapper
public interface ServiceExaminationManagementMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceExaminationManagement record);

    int insertSelective(ServiceExaminationManagement record);

    ServiceExaminationManagement selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceExaminationManagement record);

    int updateByPrimaryKey(ServiceExaminationManagement record);

    List<GetServiceExaminationManagementDto> selectExaminationAll(@Param("userId") String userId);

    List<GetServiceExaminationManagementDto> selectExaminationByCategory(@Param("userId") String userId,@Param("questionCategoryId") String questionCategoryId);

    GetExaminationManagementByIdDto selectExaminationById(@Param("userId") String userId, @Param("id") String id);
}