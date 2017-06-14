package org.domain.testeam.session;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.StatusMessages;
import org.jboss.seam.log.Log;

@Name("Action1")
@Scope(ScopeType.CONVERSATION)
public class Action1Bean implements Action1Local
{
    @Logger private Log log;

    @In StatusMessages statusMessages;

    public void action1()
    {
        // implement your business logic here
        log.info("Action1.action1() action called");
        statusMessages.add("action1");
    }

    // add additional action methods

}
