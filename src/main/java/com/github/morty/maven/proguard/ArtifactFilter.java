/**
 * Pyx4me framework
 * Copyright (C) 2006-2008 pyx4j.com.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * @author vlads
 * @version $Id$
 */
package com.github.morty.maven.proguard;

import org.apache.maven.artifact.Artifact;

public class ArtifactFilter {

	protected String groupId;

	protected String artifactId;

	protected String classifier;

	public boolean match(Artifact artifact) {
		return (artifact.getArtifactId().equals(this.artifactId) && artifact.getGroupId().equals(this.groupId) && (((this.classifier == null) && (artifact
				.getClassifier() == null)) || ((this.classifier != null) && this.classifier.equals(artifact
				.getClassifier()))));
	}
}
