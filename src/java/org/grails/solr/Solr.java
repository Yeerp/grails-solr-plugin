/*
* Copyright 2010 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
* ----------------------------------------------------------------------------
* Original Author: Mike Brevoort, http://mike.brevoort.com
* Project sponsored by:
*     Avalon Consulting LLC - http://avalonconsult.com
*     Patheos.com - http://patheos.com
* ----------------------------------------------------------------------------
*/

package org.grails.solr;

import java.lang.annotation.*;

/**
 * Describes the Solr annotated API element.
 * If exists on the field then field will be indexed - otherwise no.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Solr {
    String field() default "";
    //Define field to store translatable values
    //E.g. if field is 'description', then we will values into 'description_en', 'description_it'
    //based on supported locales
    String translatableField() default "";

    boolean asText() default false;

    boolean asTextAlso() default false;

    boolean ignore() default false;
}