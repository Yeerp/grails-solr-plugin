package org.grails.solr;

/**
 * Define whether class can provide any data to index
 *
 * @author Michael Astreiko
 */
public interface Searchable {
    /**
     * Retrieve information to store in index. Can be language Specific
     * @param languageId if defined should manage to retrieve lan specific content
     * @return text information about object to store in index
     */
    String toSearchString(String languageId);
}
