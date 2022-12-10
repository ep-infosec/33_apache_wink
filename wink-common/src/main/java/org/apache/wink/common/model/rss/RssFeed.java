/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-456 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.20 at 10:55:05 AM IST 
//

package org.apache.wink.common.model.rss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.wink.common.model.synd.SyndFeed;

/**
 * <p>
 * Java class for "rss" element of <a
 * href="http://www.rssboard.org/rss-specification">RSS 2.0 Specification</a>.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;channel&quot; type=&quot;{}rssChannel&quot;/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name=&quot;version&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * <p>
 * At the top level, a RSS document is a &lt;rss&gt; element, with a mandatory
 * attribute called version, that specifies the version of RSS that the document
 * conforms to. If it conforms to RSS 2.0 specification, the version attribute
 * must be 2.0.
 * </p>
 * <p>
 * Subordinate to the &lt;rss&gt; element is a single &lt;channel&gt; element,
 * which contains information about the channel (metadata) and its contents.
 * </p>
 * 
 * @see RssChannel RssChannel.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"channel"})
@XmlRootElement(name = "rss")
public class RssFeed {

    /**
     * Creates an RssFeed object
     */
    public RssFeed() {
    }

    /**
     * Creates an RssFeed object out of a SyndFeed object. Used for mapping
     * Syndication Object Model into RSS.
     * 
     * @param syndFeed the SyndFeed object which has to be mapped into an RSS
     *            object
     */
    public RssFeed(SyndFeed syndFeed) {
        setChannel(new RssChannel(syndFeed));
        setVersion("2.0"); //$NON-NLS-1$
    }

    /**
     * Maps RssFeed into Syndication Object Model (SyndFeed). This enables the
     * common SyndFeed APIs to be used for reading both RSS and Atom documents.
     * 
     * <pre>
     * ...
     * // perform a GET on the RSS resource. The resource will be returned as an Rss object
     * RssFeed rssFeed = resource.accept(MediaType.APPLICATION_XML).get(RssFeed.class);
     * 
     * // Map RSS into SyndFeed
     * SyndFeed syndFeed = new SyndFeed();
     * syndFeed = rssFeed.toSynd(syndFeed);
     * 
     * // Now access RSS using SyndFeed APIs
     * ...
     * </pre>
     * 
     * @param syndFeed the SyndFeed object into which the given RSS object has to be mapped into
     * @return the SyndFeed object into which the given RSS object has been mapped into
     */
    public SyndFeed toSynd(SyndFeed syndFeed) {
        if (syndFeed == null) {
            return syndFeed;
        }
        syndFeed = getChannel().toSynd(syndFeed);
        return syndFeed;
    }

    @XmlElement(required = true)
    protected RssChannel channel;
    @XmlAttribute(required = true)
    protected String     version;

    /**
     * Gets the value of the channel property.
     * 
     * @return possible object is {@link RssChannel }
     */
    public RssChannel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value allowed object is {@link RssChannel }
     */
    public void setChannel(RssChannel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

}