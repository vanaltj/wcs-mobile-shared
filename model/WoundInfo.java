/*
 * Copyright 2011 Jon VanAlten
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rhok.wcs.shared.model;

import android.graphics.Point;

/**
 * 
 * @author Jon VanAlten
 *
 */
public class WoundInfo {
	private PatientInfo pinfo;
	
	public WoundInfo() {
		pinfo = new PatientInfo();
	}
	
	public String getPatientName() {
		return pinfo.getName();
	}
	
	public void setPatientName(String name) {
		pinfo.setName(name);
	}
	
	public int getPatientAge() {
		return pinfo.getAge();
	}
	
	public void setPatientAge(int age) {
		pinfo.setAge(age);
	}
	
	public Gender getPatientGender() {
		return pinfo.getGender();
	}
	
	public void setPatientGender(Gender gender) {
		pinfo.setGender(gender);
	}
	
	public void addReferenceEndpoint(Point point) {
		
	}
}
