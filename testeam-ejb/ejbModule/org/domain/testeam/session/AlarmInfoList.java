package org.domain.testeam.session;

import org.domain.testeam.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("alarmInfoList")
public class AlarmInfoList extends EntityQuery<AlarmInfo> {

	private static final String EJBQL = "select alarmInfo from AlarmInfo alarmInfo";

	private static final String[] RESTRICTIONS = { "lower(alarmInfo.content) like lower(concat(#{alarmInfoList.alarmInfo.content},'%'))", };

	private AlarmInfo alarmInfo = new AlarmInfo();

	public AlarmInfoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public AlarmInfo getAlarmInfo() {
		return alarmInfo;
	}
}
