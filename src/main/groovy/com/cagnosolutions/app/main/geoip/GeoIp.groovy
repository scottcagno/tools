package com.cagnosolutions.app.main.geoip

import groovy.transform.CompileStatic
import javax.persistence.Entity
import javax.persistence.Id

@CompileStatic
@Entity
class GeoIp {

	@Id
	String startip

	String endip
	String state
	String city
	String country
}
