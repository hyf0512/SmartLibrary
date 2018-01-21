package com.smartlibrary.service;


import com.smartlibrary.dao.VersionDao;
import com.smartlibrary.domain.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VersionService {

	@Autowired
	private VersionDao versionDao;
	public List<Version> getVersionList(){
		Version temp =new Version();
		return versionDao.getVersionList(temp);
	}
	public Version getOneVersion(Version version){
		return versionDao.getOneVersion(version);
	}
	public Version getLastVersion(Version version){
		return versionDao.getLastVersion(version);
	}
	public int addVersion(Version version){
		return versionDao.addVersion(version);
	}
	public int editVersion(Version version){
		return versionDao.editVersion(version);
	}
}
