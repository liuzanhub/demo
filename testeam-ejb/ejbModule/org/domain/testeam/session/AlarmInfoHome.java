package org.domain.testeam.session;

import org.domain.testeam.entity.*;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityHome;

@Name("alarmInfoHome")
@Scope(ScopeType.BUSINESS_PROCESS)
public class AlarmInfoHome extends EntityHome<AlarmInfo> {

	public void setAlarmInfoAlarmInfoId(Integer id) {
		setId(id);
	}

	public Integer getAlarmInfoAlarmInfoId() {
		return (Integer) getId();
	}

	@Override
	protected AlarmInfo createInstance() {
		AlarmInfo alarmInfo = new AlarmInfo();
		return alarmInfo;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public AlarmInfo getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
