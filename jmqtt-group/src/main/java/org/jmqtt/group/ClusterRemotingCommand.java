package org.jmqtt.group;

import java.util.HashMap;

/**
 * cluster remoting command
 */
public class ClusterRemotingCommand {

    /**
     * message command
     */
    private int code;
    private HashMap<String,String> extField;
    private transient byte[] body;

    public ClusterRemotingCommand() {
    }
}
