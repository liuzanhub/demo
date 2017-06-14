package org.domain.testeam.session;

import javax.ejb.Stateless;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.jboss.seam.international.StatusMessages;

@Stateless
@Name("Action")
public class ActionBean implements ActionLocal
{
    @Logger private Log log;

    @In StatusMessages statusMessages;

    public void action()
    {
        // implement your business logic here
        log.info("Action.action() action called");
        statusMessages.add("action");
    }

    // add additional action methods

}
