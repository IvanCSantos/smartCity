package agents;

import javax.swing.JOptionPane;
import jade.core.behaviours.*;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Drone extends Agent {
	
	@Override
	protected void setup() {
		addBehaviour(new CyclicBehaviour() {
			
			@Override
			public void action() {
				// Receive the message
				ACLMessage msg=receive();
				if(msg!=null) {
					JOptionPane.showMessageDialog(null, "Message received " + msg.getContent());
					
				} else block();
			}
		});
	}
}