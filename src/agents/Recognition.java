package agents;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.core.AID;
import jade.core.behaviours.*;


public class Recognition extends Agent {

	@Override
	protected void setup() {
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				// Send a message to another agent
				ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
				msg.setContent("Send");
				msg.addReceiver(new AID("Drone", AID.ISLOCALNAME));
				send(msg);
			}
		});
	}
}
