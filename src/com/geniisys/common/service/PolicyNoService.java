package com.geniisys.common.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.PolicyNo;

public interface PolicyNoService {
	Integer getPolicyId(HttpServletRequest request) throws SQLException;
	Integer getPolicyIdNonRenew(HttpServletRequest request) throws SQLException;
	Integer getPolicyIdRenew(HttpServletRequest request) throws SQLException;
}
