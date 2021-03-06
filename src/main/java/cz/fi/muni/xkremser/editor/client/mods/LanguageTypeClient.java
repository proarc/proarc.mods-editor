/*
 * Metadata Editor
 * @author Jiri Kremser
 * 
 * 
 * 
 * Metadata Editor - Rich internet application for editing metadata.
 * Copyright (C) 2011  Jiri Kremser (kremser@mzk.cz)
 * Moravian Library in Brno
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * 
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.13 at 05:02:55 odp. CET 
//

package cz.fi.muni.xkremser.editor.client.mods;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

// TODO: Auto-generated Javadoc
/**
 * The Class LanguageTypeClient.
 */
public class LanguageTypeClient
        implements IsSerializable {

    /** The language term. */
    protected List<LanguageTypeClient.LanguageTermClient> languageTerm;

    /** The object part. */
    protected String objectPart;

    /**
     * Gets the language term.
     * 
     * @return the language term
     */
    public List<LanguageTypeClient.LanguageTermClient> getLanguageTerm() {
        return this.languageTerm;
    }

    /**
     * Sets the language term.
     * 
     * @param languageTerm
     *        the new language term
     */
    public void setLanguageTerm(List<LanguageTypeClient.LanguageTermClient> languageTerm) {
        this.languageTerm = languageTerm;
    }

    /**
     * Gets the object part.
     * 
     * @return the object part
     */
    public String getObjectPart() {
        return objectPart;
    }

    /**
     * Sets the object part.
     * 
     * @param value
     *        the new object part
     */
    public void setObjectPart(String value) {
        this.objectPart = value;
    }

    /**
     * The Class LanguageTermClient.
     */
    public static class LanguageTermClient
            implements IsSerializable {

        /** The value. */
        protected String value;

        /** The authority. */
        protected String authority;

        /** The type. */
        protected CodeOrTextClient type;

        /**
         * Gets the value.
         * 
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value.
         * 
         * @param value
         *        the new value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the authority.
         * 
         * @return the authority
         */
        public String getAuthority() {
            return authority;
        }

        /**
         * Sets the authority.
         * 
         * @param value
         *        the new authority
         */
        public void setAuthority(String value) {
            this.authority = value;
        }

        /**
         * Gets the type.
         * 
         * @return the type
         */
        public CodeOrTextClient getType() {
            return type;
        }

        /**
         * Sets the type.
         * 
         * @param value
         *        the new type
         */
        public void setType(CodeOrTextClient value) {
            this.type = value;
        }

    }

}
