package com.mattmalec.pterodactyl4j.client.entities;

import com.mattmalec.pterodactyl4j.client.managers.BackupManager;
import com.mattmalec.pterodactyl4j.client.managers.ClientServerManager;
import com.mattmalec.pterodactyl4j.client.managers.SubuserManager;
import com.mattmalec.pterodactyl4j.client.managers.WebSocketBuilder;
import com.mattmalec.pterodactyl4j.entities.PteroAction;
import com.mattmalec.pterodactyl4j.entities.Server;

import java.util.List;
import java.util.Set;

public interface ClientServer extends Server {

	boolean isServerOwner();
	long getInternalIdLong();
	default String getInternalId() { return Long.toUnsignedString(getInternalIdLong()); }
	SFTP getSFTPDetails();
	String getInvocation();
	Set<String> getEggFeatures();
	String getNode();
	boolean isSuspended();
	boolean isInstalling();
	WebSocketBuilder getWebSocketBuilder();
	List<ClientSubuser> getSubusers();
	SubuserManager getSubuserManager();
	ClientEgg getEgg();
	ClientServerManager getManager();
	PteroAction<List<Backup>> retrieveBackups();
	BackupManager getBackupManager();

}
