/*
 * Copyright 2013 Thomas Bocek
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package net.tomp2p.connection;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;

import java.net.InetAddress;

/**
 * The class that stores the limits for the resource reservation.
 * 
 * @author Thomas Bocek
 * 
 */
public class ChannelClientConfiguration {
	
    private int maxPermitsUDP;
    private int maxPermitsTCP;

    private SignatureFactory signatureFactory;
    private Bindings bindings;
    
    private InetAddress fromAddress = null;
  

    /**
     * @return The maximum number of short-lived UDP connections
     */
    public int maxPermitsUDP() {
        return maxPermitsUDP;
    }

    /**
     * @param maxPermitsUDP
     *            The maximum number of short-lived UDP connections
     * @return This class
     */
    public ChannelClientConfiguration maxPermitsUDP(final int maxPermitsUDP) {
        this.maxPermitsUDP = maxPermitsUDP;
        return this;
    }

    /**
     * @return The maximum number of short-lived TCP connections
     */
    public int maxPermitsTCP() {
        return maxPermitsTCP;
    }

    /**
     * @param maxPermitsTCP
     *            The maximum number of short-lived TCP connections
     * @return This class
     */
    public ChannelClientConfiguration maxPermitsTCP(final int maxPermitsTCP) {
        this.maxPermitsTCP = maxPermitsTCP;
        return this;
    }

    /**
     * @return The factory for the signature
     */
    public SignatureFactory signatureFactory() {
        return signatureFactory;
    }

    /**
     * @param signatureFactory
     *            The factory for the signature
     * @return This class
     */
    public ChannelClientConfiguration signatureFactory(final SignatureFactory signatureFactory) {
        this.signatureFactory = signatureFactory;
        return this;
    }

    /**
     * @return The bindings
     */
    public Bindings bindings() {
        return bindings;
    }

    /**
     * @param bindings
     *            The bindings
     * @return This class
     */
    public ChannelClientConfiguration bindings(Bindings bindings) {
        this.bindings = bindings;
        return this;
    }

	public InetAddress fromAddress() {
	    return fromAddress;
    }
	
	public ChannelClientConfiguration fromAddress(InetAddress fromAddress) {
		this.fromAddress = fromAddress;
	    return this;
    }

	public ByteBufAllocator byteBufAllocator() {
		return UnpooledByteBufAllocator.DEFAULT;
	}
}
