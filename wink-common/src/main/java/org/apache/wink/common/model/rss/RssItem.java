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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.wink.common.model.synd.SyndCategory;
import org.apache.wink.common.model.synd.SyndEntry;
import org.apache.wink.common.model.synd.SyndLink;
import org.apache.wink.common.model.synd.SyndPerson;
import org.apache.wink.common.model.synd.SyndText;
import org.apache.wink.common.model.synd.SyndTextType;

/**
 * <p>
 * Java class for "item" element of <a
 * href="http://www.rssboard.org/rss-specification">RSS 2.0 Specification</a>.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;rssItem&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;title&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;link&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}anyURI&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;description&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;author&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;category&quot; type=&quot;{}rssCategory&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;comments&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}anyURI&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;enclosure&quot; type=&quot;{}rssEnclosure&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;guid&quot; type=&quot;{}rssGuid&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;pubDate&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *         &lt;element name=&quot;source&quot; type=&quot;{}rssSource&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;any/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * <h4>Elements of &lt;item&gt;</h4>
 * <p>
 * A channel may contain any number of &lt;item&gt;s. An item may represent a
 * "story" -- much like a story in a newspaper or magazine; if so its
 * description is a synopsis of the story, and the link points to the full
 * story. An item may also be complete in itself, if so, the description
 * contains the text (entity-encoded HTML is allowed; see <a
 * href="http://www.rssboard.org/rss-encoding-examples">examples</a>), and the
 * link and title may be omitted. All elements of an item are optional, however
 * at least one of title or description must be present.
 * </p>
 * <table cellspacing="10">
 * <tbody>
 * <tr valign="top">
 * <td><i>Element</i></td>
 * <td><i>Description</i></td>
 * <td width="50%"><i>Example</i></td>
 * </tr>
 * <tr valign="top">
 * <td><span>title</span></td>
 * <td>The title of the item.</td>
 * <td>Venice Film Festival Tries to Quit Sinking</td>
 * </tr>
 * <tr valign="top">
 * <td><span>link</span></td>
 * <td>The URL of the item.</td>
 * <td>http://nytimes.com/2004/12/07FEST.html</td>
 * </tr>
 * <tr valign="top">
 * <td><span>description</span></td>
 * <td>The item synopsis.</td>
 * <td>&lt;description&gt;Some of the most heated chatter at the Venice Film
 * Festival this week was about the way that the arrival of the stars at the
 * Palazzo del Cinema was being staged.&lt;/description&gt;</td>
 * </tr>
 * <tr valign="top">
 * <td><span>author</span></td>
 * <td>Email address of the author of the item. For newspapers and magazines
 * syndicating via RSS, the author is the person who wrote the article that the
 * &lt;item&gt; describes. For collaborative weblogs, the author of the item
 * might be different from the managing editor or webmaster. For a weblog
 * authored by a single individual it would make sense to omit the
 * &lt;author&gt; element.</td>
 * <td>&lt;author&gt;lawyer@boyer.net (Lawyer Boyer)&lt;/author&gt;</td>
 * </tr>
 * <tr valign="top">
 * <td><span>category</span></td>
 * <td>Includes the item in one or more categories. More
 * {@linkplain RssCategory here}.</td>
 * <td></td>
 * </tr>
 * <tr valign="top">
 * <td><span>comments</span></td>
 * <td>URL of a page for comments relating to the item. More <a
 * href="http://www.rssboard.org/rss-weblog-comments-use-case">here</a>..</td>
 * <td>&lt;comments&gt;http://ekzemplo.com/entry/4403/comments&lt;/comments&gt;</td>
 * </tr>
 * <tr valign="top">
 * <td><span>enclosure</span></td>
 * <td>Describes a media object that is attached to the item. More
 * {@linkplain RssEnclosure here}.</td>
 * <td></td>
 * </tr>
 * <tr valign="top">
 * <td><span>guid</span></td>
 * <td>A string that uniquely identifies the item. More {@linkplain RssGuid
 * here}.</td>
 * <td></td>
 * </tr>
 * <tr valign="top">
 * <td><span>pubDate</span></td>
 * <td>Indicates when the item was published. If it's a date in the future,
 * aggregators may choose to not display the item until that date.</td>
 * <td>&lt;pubDate&gt;Sun, 19 May 2002 15:21:36 GMT&lt;/pubDate&gt;</td>
 * </tr>
 * <tr valign="top">
 * <td><span>source</span></td>
 * <td>The RSS channel that the item came from. More {@linkplain RssSource here}
 * .</td>
 * <td></td>
 * </tr>
 * </tbody>
 * </table>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rssItem", propOrder = {})
public class RssItem {

    protected String            title;
    @XmlSchemaType(name = "anyURI")
    protected String            link;
    protected String            description;
    protected String            author;
    protected List<RssCategory> category;
    @XmlSchemaType(name = "anyURI")
    protected String            comments;
    protected RssEnclosure      enclosure;
    protected RssGuid           guid;
    @XmlElement(required = true)
    protected String            pubDate;
    protected RssSource         source;
    @XmlAnyElement(lax = true)
    protected List<Object>      any;

    /**
     * Creates an RssItem object
     */
    public RssItem() {
    }

    /**
     * Creates an RssItem object out of a SyndEntry object. Used for mapping
     * Syndication Object Model into RSS.
     * 
     * @param syndEntry the SyndEntry object which has to be mapped into an
     *            RssItem object.
     */
    public RssItem(SyndEntry syndEntry) {
        if (syndEntry.getTitle() != null && syndEntry.getTitle().getValue() != null) {
            setTitle(syndEntry.getTitle().getValue());
        }
        SyndLink link = syndEntry.getLink("alternate"); //$NON-NLS-1$
        if (link != null && link.getHref() != null) {
            setLink(link.getHref());
        }
        if (syndEntry.getSummary() != null && syndEntry.getSummary().getValue() != null) {
            setDescription(syndEntry.getSummary().getValue());
        }
        if (syndEntry.getAuthors().size() > 0) {
            SyndPerson syndAuthor = syndEntry.getAuthors().get(0);
            if (syndAuthor.getEmail() != null) {
                setAuthor(syndAuthor.getEmail());
            }
        }
        getCategories().clear();
        for (SyndCategory syndCategory : syndEntry.getCategories()) {
            getCategories().add(new RssCategory(syndCategory));
        }
        link = syndEntry.getLink("enclosure"); //$NON-NLS-1$
        if (link != null) {
            setEnclosure(new RssEnclosure(link));
        }
        if (syndEntry.getId() != null) {
            RssGuid rssGuid = new RssGuid();
            rssGuid.setContent(syndEntry.getId());
            setGuid(rssGuid);
        }
        if (syndEntry.getPublished() != null) {
            setPubDate(RssChannel.convertJavaDateToRssDate(syndEntry.getPublished()));
        }
    }

    /**
     * Maps an RssItem object into a SyndEntry object. Used for mapping RSS into
     * Syndication Object Model.
     * 
     * @param syndEntry the SyndEntry object into which the given RssItem object
     *            has to be mapped into
     * @return the SyndEntry object into which the given RssItem object has been
     *         mapped into
     */
    public SyndEntry toSynd(SyndEntry syndEntry) {
        if (syndEntry == null) {
            return syndEntry;
        }
        if (getTitle() != null) {
            syndEntry.setTitle(new SyndText(getTitle(), SyndTextType.text));
        }
        if (getLink() != null) {
            SyndLink syndLink = new SyndLink();
            syndLink.setHref(getLink());
            syndLink.setRel("alternate"); //$NON-NLS-1$
            syndEntry.getLinks().add(syndLink);
        }
        if (getDescription() != null) {
            syndEntry.setSummary(new SyndText(getDescription()));
        }
        if (getAuthor() != null) {
            SyndPerson syndAuthor = new SyndPerson();
            String authorEmail = getAuthor();
            syndAuthor.setEmail(authorEmail);
            syndAuthor.setName(authorEmail.substring(0, authorEmail.indexOf("@"))); //$NON-NLS-1$
            syndEntry.getAuthors().add(syndAuthor);
        }
        syndEntry.getCategories().clear();
        for (RssCategory rssCategory : getCategories()) {
            SyndCategory syndCategory = new SyndCategory();
            syndCategory = rssCategory.toSynd(syndCategory);
            syndEntry.getCategories().add(syndCategory);
        }
        if (getEnclosure() != null) {
            SyndLink syndEnclosureLink = new SyndLink();
            syndEnclosureLink = getEnclosure().toSynd(syndEnclosureLink);
            syndEntry.getLinks().add(syndEnclosureLink);
        }
        if (getGuid() != null) {
            syndEntry.setId(getGuid().getContent());
        }
        if (getPubDate() != null) {
            syndEntry.setPublished(RssChannel.convertRssDateToJavaDate(getPubDate()));
        }
        return syndEntry;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return possible object is {@link String }
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return possible object is {@link String }
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the category property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the category property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCategories().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RssCategory }
     */
    public List<RssCategory> getCategories() {
        if (category == null) {
            category = new ArrayList<RssCategory>();
        }
        return this.category;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return possible object is {@link String }
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the enclosure property.
     * 
     * @return possible object is {@link RssEnclosure }
     */
    public RssEnclosure getEnclosure() {
        return enclosure;
    }

    /**
     * Sets the value of the enclosure property.
     * 
     * @param value allowed object is {@link RssEnclosure }
     */
    public void setEnclosure(RssEnclosure value) {
        this.enclosure = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return possible object is {@link RssGuid }
     */
    public RssGuid getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value allowed object is {@link RssGuid }
     */
    public void setGuid(RssGuid value) {
        this.guid = value;
    }

    /**
     * Gets the value of the pubDate property.
     * 
     * @return possible object is {@link String }
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Sets the value of the pubDate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return possible object is {@link RssSource }
     */
    public RssSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value allowed object is {@link RssSource }
     */
    public void setSource(RssSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
