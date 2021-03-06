/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.taglib.staging;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Brian Wing Shun Chan
 */
public class MenuTag extends IncludeTag {

	public void setCssClass(String cssClass) {
		_cssClass = cssClass;
	}

	public void setExtended(boolean extended) {
		_extended = extended;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public void setIcon(String icon) {
		_icon = icon;
	}

	public void setLayoutSetBranchId(long layoutSetBranchId) {
		_layoutSetBranchId = layoutSetBranchId;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public void setOnlyActions(boolean onlyActions) {
		_onlyActions = onlyActions;
	}

	public void setPrivateLayout(boolean privateLayout) {
		_privateLayout = privateLayout;
	}

	public void setSelPlid(long selPlid) {
		_selPlid = selPlid;
	}

	public void setShowManageBranches(boolean showManageBranches) {
		_showManageBranches = showManageBranches;
	}

	@Override
	protected void cleanUp() {
		_cssClass = null;
		_extended = true;
		_groupId = 0;
		_icon = "/dockbar/staging.png";
		_layoutSetBranchId = 0;
		_message = "staging";
		_onlyActions = false;
		_privateLayout = false;
		_selPlid = 0;
		_showManageBranches = false;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("liferay-staging:menu:cssClass", _cssClass);
		request.setAttribute(
			"liferay-staging:menu:extended", String.valueOf(_extended));
		request.setAttribute(
			"liferay-staging:menu:groupId", String.valueOf(_groupId));
		request.setAttribute("liferay-staging:menu:icon", _icon);
		request.setAttribute(
			"liferay-staging:menu:layoutSetBranchId",
			String.valueOf(_layoutSetBranchId));
		request.setAttribute("liferay-staging:menu:message", _message);
		request.setAttribute(
			"liferay-staging:menu:onlyActions", String.valueOf(_onlyActions));
		request.setAttribute(
			"liferay-staging:menu:privateLayout",
			String.valueOf(_privateLayout));
		request.setAttribute(
			"liferay-staging:menu:selPlid", String.valueOf(_selPlid));
		request.setAttribute(
			"liferay-staging:menu:showManageBranches",
			String.valueOf(_showManageBranches));
	}

	private static final String _PAGE = "/html/taglib/staging/menu/page.jsp";

	private String _cssClass;
	private boolean _extended = true;
	private long _groupId;
	private String _icon = "/dockbar/staging.png";
	private long _layoutSetBranchId;
	private String _message = "staging";
	private boolean _onlyActions;
	private boolean _privateLayout;
	private long _selPlid;
	private boolean _showManageBranches;

}