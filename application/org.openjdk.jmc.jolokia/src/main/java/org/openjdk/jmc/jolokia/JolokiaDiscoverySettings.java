package org.openjdk.jmc.jolokia;

import org.jolokia.server.core.service.api.JolokiaContext;

public interface JolokiaDiscoverySettings {
	boolean shouldRunDiscovery();

	JolokiaContext getJolokiaContext();

	String getMulticastPort();

	String getMulticastGroup();

}
