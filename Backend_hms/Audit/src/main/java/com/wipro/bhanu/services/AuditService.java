package com.wipro.bhanu.services;



import java.util.List;

import com.wipro.bhanu.entities.AuditLog;

public interface AuditService {
    AuditLog saveAuditLog(String eventType, String entityType, String entityId, String description);
    List<AuditLog> getAllLogs();
    List<AuditLog> getLogsByEntityType(String entityType);
    List<AuditLog> getLogsByEventType(String eventType);
}

