package com.cagnosolutions.app.main.geoip

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service


@CompileStatic
@Service(value = "geoipService")
class GeoIpService {

	@Autowired
	GeoIpRepository repo

	GeoIp findOne(String ip) {
		repo.findOne ip
	}
}

@CompileStatic
@Repository
interface GeoIpRepository extends JpaRepository<GeoIp, String> {

	@Query(nativeQuery = true, value = "SELECT * FROM geoip WHERE ipstart <= ':ip' ORDER BY ipstart DESC LIMIT 1")
	GeoIp findState(@Param("ip") String ip)

}