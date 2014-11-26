package com.cagnosolutions.app.main.geoip

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@CompileStatic
@Controller
@RequestMapping(value = "/geoip")
class GeoIpController {

	@Autowired
	GeoIpService geoipService

	@RequestMapping(value = "/{ip}", method = RequestMethod.GET)
	@ResponseBody
	Object getState(@PathVariable String ip) {
		geoipService.findOne ip
	}

}
