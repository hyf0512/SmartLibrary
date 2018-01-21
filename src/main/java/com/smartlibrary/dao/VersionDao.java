package com.smartlibrary.dao;

import com.smartlibrary.domain.Version;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VersionDao {
	public abstract List<Version> getVersionList(Version version);
	public abstract Version getOneVersion(Version version);
	public abstract Version getLastVersion(Version version);
	public abstract int addVersion(Version version);
	public abstract int editVersion(Version version);
}
