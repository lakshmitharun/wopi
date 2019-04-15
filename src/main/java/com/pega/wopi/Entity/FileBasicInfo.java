package com.pega.wopi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileBasicInfo {

    @JsonProperty(value = "BaseFileName")
    private String baseFileName;

    @JsonProperty(value = "Size")
    private long size;

    @JsonProperty(value = "OwnerId")
    private String ownerId;

    @JsonProperty(value = "Version")
    private String version;

    @JsonProperty(value = "SHA256")
    private String sha256;

    @JsonProperty(value = "AllowExternalMarketplace")
    private boolean allowExternalMarketplace;

    @JsonProperty(value = "UserCanWrite")
    private boolean userCanWrite;

    @JsonProperty(value = "SupportsUpdate")
    private boolean supportsUpdate;

    @JsonProperty(value = "BreadcrumbBrandName")
    private String breadcrumbBrandName;

    @JsonProperty(value = "BreadcrumbBrandUrl")
    private String breadcrumbBrandUrl;

    @JsonProperty(value = "BreadcrumbDocName")
    private String breadcrumbDocName;

    @JsonProperty(value = "BreadcrumbDocUrl")
    private String breadcrumbDocUrl;

    @JsonProperty(value = "BreadcrumbFolderName")
    private String breadcrumbFolderName;

    @JsonProperty(value = "BreadcrumbFolderUrl")
    private String breadcrumbFolderUrl;

    @JsonProperty(value = "ClientUrl")
    private String clientUrl;

    @JsonProperty(value = "CloseButtonClosesWindow")
    private boolean closeButtonClosesWindow = false;

    @JsonProperty(value = "CloseUrl")
    private String closeUrl;

    @JsonProperty(value = "DisableBrowserCachingOfUserContent")
    private boolean disableBrowserCachingOfUserContent = false;

    @JsonProperty(value = "DisablePrint")
    private boolean disablePrint = false;

    @JsonProperty(value = "DisableTranslation")
    private boolean disableTranslation = false;

    @JsonProperty(value = "DownloadUrl")
    private String downloadUrl;

    @JsonProperty(value = "FileSharingUrl")
    private String fileSharingUrl;

    @JsonProperty(value = "FileUrl")
    private String fileUrl;

    @JsonProperty(value = "HostAuthenticationId")
    private String hostAuthenticationId;

    @JsonProperty(value = "HostEditUrl")
    private String hostEditUrl;

    @JsonProperty(value = "HostEmbeddedEditUrl")
    private String hostEmbeddedEditUrl;

    @JsonProperty(value = "HostEmbeddedViewUrl")
    private String hostEmbeddedViewUrl;

    @JsonProperty(value = "HostName")
    private String hostName;

    @JsonProperty(value = "HostNotes")
    private String hostNotes;

    @JsonProperty(value = "HostRestUrl")
    private String hostRestUrl;

    @JsonProperty(value = "HostViewUrl")
    private String hostViewUrl;

    @JsonProperty(value = "IrmPolicyDescription")
    private String irmPolicyDescription;

    @JsonProperty(value = "IrmPolicyTitle")
    private String irmPolicyTitle;

    @JsonProperty(value = "PresenceProvider")
    private String presenceProvider;

    @JsonProperty(value = "PresenceUserId")
    private String presenceUserId;

    @JsonProperty(value = "PrivacyUrl")
    private String privacyUrl;

    @JsonProperty(value = "ProtectInClient")
    private boolean protectInClient = false;

    @JsonProperty(value = "ReadOnly")
    private boolean readOnly = false;

    @JsonProperty(value = "RestrictedWebViewOnly")
    private boolean restrictedWebViewOnly = false;

    @JsonProperty(value = "SignoutUrl")
    private String signoutUrl;

    @JsonProperty(value = "SupportsCoauth")
    private boolean supportsCoauth = false;

    @JsonProperty(value = "SupportsCobalt")
    private boolean supportsCobalt = false;

    @JsonProperty(value = "SupportsFolders")
    private boolean supportsFolders = true;

    @JsonProperty(value = "SupportsLocks")
    private boolean supportsLocks = true;

    @JsonProperty(value = "SupportsScenarioLinks")
    private boolean supportsScenarioLinks = false;

    @JsonProperty(value = "SupportsSecureStore")
    private boolean supportsSecureStore = false;

    @JsonProperty(value = "TenantId")
    private String tenantId;

    @JsonProperty(value = "TermsOfUseUrl")
    private String termsOfUseUrl;

    @JsonProperty(value = "TimeZone")
    private String timeZone;

    @JsonProperty(value = "UserCanAttend")
    private boolean userCanAttend = false;

    @JsonProperty(value = "UserCanNotWriteRelative")
    private boolean userCanNotWriteRelative = false;

    @JsonProperty(value = "UserCanPresent")
    private boolean userCanPresent = false;

    @JsonProperty(value = "UserFriendlyName")
    private String userFriendlyName;

    @JsonProperty(value = "UserId")
    private String userId;

    @JsonProperty(value = "WebEditingDisabled")
    private boolean webEditingDisabled = false;

    public String getBaseFileName() {
        return baseFileName;
    }

    public void setBaseFileName(String baseFileName) {
        this.baseFileName = baseFileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public boolean isAllowExternalMarketplace() {
        return allowExternalMarketplace;
    }

    public void setAllowExternalMarketplace(boolean allowExternalMarketplace) {
        this.allowExternalMarketplace = allowExternalMarketplace;
    }

    public boolean isUserCanWrite() {
        return userCanWrite;
    }

    public void setUserCanWrite(boolean userCanWrite) {
        this.userCanWrite = userCanWrite;
    }

    public boolean isSupportsUpdate() {
        return supportsUpdate;
    }

    public void setSupportsUpdate(boolean supportsUpdate) {
        this.supportsUpdate = supportsUpdate;
    }

    public String getBreadcrumbBrandName() {
        return breadcrumbBrandName;
    }

    public void setBreadcrumbBrandName(String breadcrumbBrandName) {
        this.breadcrumbBrandName = breadcrumbBrandName;
    }

    public String getBreadcrumbBrandUrl() {
        return breadcrumbBrandUrl;
    }

    public void setBreadcrumbBrandUrl(String breadcrumbBrandUrl) {
        this.breadcrumbBrandUrl = breadcrumbBrandUrl;
    }

    public String getBreadcrumbDocName() {
        return breadcrumbDocName;
    }

    public void setBreadcrumbDocName(String breadcrumbDocName) {
        this.breadcrumbDocName = breadcrumbDocName;
    }

    public String getBreadcrumbDocUrl() {
        return breadcrumbDocUrl;
    }

    public void setBreadcrumbDocUrl(String breadcrumbDocUrl) {
        this.breadcrumbDocUrl = breadcrumbDocUrl;
    }

    public String getBreadcrumbFolderName() {
        return breadcrumbFolderName;
    }

    public void setBreadcrumbFolderName(String breadcrumbFolderName) {
        this.breadcrumbFolderName = breadcrumbFolderName;
    }

    public String getBreadcrumbFolderUrl() {
        return breadcrumbFolderUrl;
    }

    public void setBreadcrumbFolderUrl(String breadcrumbFolderUrl) {
        this.breadcrumbFolderUrl = breadcrumbFolderUrl;
    }

    public String getClientUrl() {
        return clientUrl;
    }

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public boolean isCloseButtonClosesWindow() {
        return closeButtonClosesWindow;
    }

    public void setCloseButtonClosesWindow(boolean closeButtonClosesWindow) {
        this.closeButtonClosesWindow = closeButtonClosesWindow;
    }

    public String getCloseUrl() {
        return closeUrl;
    }

    public void setCloseUrl(String closeUrl) {
        this.closeUrl = closeUrl;
    }

    public boolean isDisableBrowserCachingOfUserContent() {
        return disableBrowserCachingOfUserContent;
    }

    public void setDisableBrowserCachingOfUserContent(boolean disableBrowserCachingOfUserContent) {
        this.disableBrowserCachingOfUserContent = disableBrowserCachingOfUserContent;
    }

    public boolean isDisablePrint() {
        return disablePrint;
    }

    public void setDisablePrint(boolean disablePrint) {
        this.disablePrint = disablePrint;
    }

    public boolean isDisableTranslation() {
        return disableTranslation;
    }

    public void setDisableTranslation(boolean disableTranslation) {
        this.disableTranslation = disableTranslation;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileSharingUrl() {
        return fileSharingUrl;
    }

    public void setFileSharingUrl(String fileSharingUrl) {
        this.fileSharingUrl = fileSharingUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getHostAuthenticationId() {
        return hostAuthenticationId;
    }

    public void setHostAuthenticationId(String hostAuthenticationId) {
        this.hostAuthenticationId = hostAuthenticationId;
    }

    public String getHostEditUrl() {
        return hostEditUrl;
    }

    public void setHostEditUrl(String hostEditUrl) {
        this.hostEditUrl = hostEditUrl;
    }

    public String getHostEmbeddedEditUrl() {
        return hostEmbeddedEditUrl;
    }

    public void setHostEmbeddedEditUrl(String hostEmbeddedEditUrl) {
        this.hostEmbeddedEditUrl = hostEmbeddedEditUrl;
    }

    public String getHostEmbeddedViewUrl() {
        return hostEmbeddedViewUrl;
    }

    public void setHostEmbeddedViewUrl(String hostEmbeddedViewUrl) {
        this.hostEmbeddedViewUrl = hostEmbeddedViewUrl;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostNotes() {
        return hostNotes;
    }

    public void setHostNotes(String hostNotes) {
        this.hostNotes = hostNotes;
    }

    public String getHostRestUrl() {
        return hostRestUrl;
    }

    public void setHostRestUrl(String hostRestUrl) {
        this.hostRestUrl = hostRestUrl;
    }

    public String getHostViewUrl() {
        return hostViewUrl;
    }

    public void setHostViewUrl(String hostViewUrl) {
        this.hostViewUrl = hostViewUrl;
    }

    public String getIrmPolicyDescription() {
        return irmPolicyDescription;
    }

    public void setIrmPolicyDescription(String irmPolicyDescription) {
        this.irmPolicyDescription = irmPolicyDescription;
    }

    public String getIrmPolicyTitle() {
        return irmPolicyTitle;
    }

    public void setIrmPolicyTitle(String irmPolicyTitle) {
        this.irmPolicyTitle = irmPolicyTitle;
    }

    public String getPresenceProvider() {
        return presenceProvider;
    }

    public void setPresenceProvider(String presenceProvider) {
        this.presenceProvider = presenceProvider;
    }

    public String getPresenceUserId() {
        return presenceUserId;
    }

    public void setPresenceUserId(String presenceUserId) {
        this.presenceUserId = presenceUserId;
    }

    public String getPrivacyUrl() {
        return privacyUrl;
    }

    public void setPrivacyUrl(String privacyUrl) {
        this.privacyUrl = privacyUrl;
    }

    public boolean isProtectInClient() {
        return protectInClient;
    }

    public void setProtectInClient(boolean protectInClient) {
        this.protectInClient = protectInClient;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isRestrictedWebViewOnly() {
        return restrictedWebViewOnly;
    }

    public void setRestrictedWebViewOnly(boolean restrictedWebViewOnly) {
        this.restrictedWebViewOnly = restrictedWebViewOnly;
    }

    public String getSignoutUrl() {
        return signoutUrl;
    }

    public void setSignoutUrl(String signoutUrl) {
        this.signoutUrl = signoutUrl;
    }

    public boolean isSupportsCoauth() {
        return supportsCoauth;
    }

    public void setSupportsCoauth(boolean supportsCoauth) {
        this.supportsCoauth = supportsCoauth;
    }

    public boolean isSupportsCobalt() {
        return supportsCobalt;
    }

    public void setSupportsCobalt(boolean supportsCobalt) {
        this.supportsCobalt = supportsCobalt;
    }

    public boolean isSupportsFolders() {
        return supportsFolders;
    }

    public void setSupportsFolders(boolean supportsFolders) {
        this.supportsFolders = supportsFolders;
    }

    public boolean isSupportsLocks() {
        return supportsLocks;
    }

    public void setSupportsLocks(boolean supportsLocks) {
        this.supportsLocks = supportsLocks;
    }

    public boolean isSupportsScenarioLinks() {
        return supportsScenarioLinks;
    }

    public void setSupportsScenarioLinks(boolean supportsScenarioLinks) {
        this.supportsScenarioLinks = supportsScenarioLinks;
    }

    public boolean isSupportsSecureStore() {
        return supportsSecureStore;
    }

    public void setSupportsSecureStore(boolean supportsSecureStore) {
        this.supportsSecureStore = supportsSecureStore;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTermsOfUseUrl() {
        return termsOfUseUrl;
    }

    public void setTermsOfUseUrl(String termsOfUseUrl) {
        this.termsOfUseUrl = termsOfUseUrl;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public boolean isUserCanAttend() {
        return userCanAttend;
    }

    public void setUserCanAttend(boolean userCanAttend) {
        this.userCanAttend = userCanAttend;
    }

    public boolean isUserCanNotWriteRelative() {
        return userCanNotWriteRelative;
    }

    public void setUserCanNotWriteRelative(boolean userCanNotWriteRelative) {
        this.userCanNotWriteRelative = userCanNotWriteRelative;
    }

    public boolean isUserCanPresent() {
        return userCanPresent;
    }

    public void setUserCanPresent(boolean userCanPresent) {
        this.userCanPresent = userCanPresent;
    }

    public String getUserFriendlyName() {
        return userFriendlyName;
    }

    public void setUserFriendlyName(String userFriendlyName) {
        this.userFriendlyName = userFriendlyName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isWebEditingDisabled() {
        return webEditingDisabled;
    }

    public void setWebEditingDisabled(boolean webEditingDisabled) {
        this.webEditingDisabled = webEditingDisabled;
    }

    @Override
    public String toString() {
        return "FileBasicInfo{" +
                "baseFileName='" + baseFileName + '\'' +
                ", size=" + size +
                ", ownerId='" + ownerId + '\'' +
                ", version='" + version + '\'' +
                ", sha256='" + sha256 + '\'' +
                ", allowExternalMarketplace=" + allowExternalMarketplace +
                ", userCanWrite=" + userCanWrite +
                ", supportsUpdate=" + supportsUpdate +
                ", breadcrumbBrandName='" + breadcrumbBrandName + '\'' +
                ", breadcrumbBrandUrl='" + breadcrumbBrandUrl + '\'' +
                ", breadcrumbDocName='" + breadcrumbDocName + '\'' +
                ", breadcrumbDocUrl='" + breadcrumbDocUrl + '\'' +
                ", breadcrumbFolderName='" + breadcrumbFolderName + '\'' +
                ", breadcrumbFolderUrl='" + breadcrumbFolderUrl + '\'' +
                ", clientUrl='" + clientUrl + '\'' +
                ", closeButtonClosesWindow=" + closeButtonClosesWindow +
                ", closeUrl='" + closeUrl + '\'' +
                ", disableBrowserCachingOfUserContent=" + disableBrowserCachingOfUserContent +
                ", disablePrint=" + disablePrint +
                ", disableTranslation=" + disableTranslation +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", fileSharingUrl='" + fileSharingUrl + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", hostAuthenticationId='" + hostAuthenticationId + '\'' +
                ", hostEditUrl='" + hostEditUrl + '\'' +
                ", hostEmbeddedEditUrl='" + hostEmbeddedEditUrl + '\'' +
                ", hostEmbeddedViewUrl='" + hostEmbeddedViewUrl + '\'' +
                ", hostName='" + hostName + '\'' +
                ", hostNotes='" + hostNotes + '\'' +
                ", hostRestUrl='" + hostRestUrl + '\'' +
                ", hostViewUrl='" + hostViewUrl + '\'' +
                ", irmPolicyDescription='" + irmPolicyDescription + '\'' +
                ", irmPolicyTitle='" + irmPolicyTitle + '\'' +
                ", presenceProvider='" + presenceProvider + '\'' +
                ", presenceUserId='" + presenceUserId + '\'' +
                ", privacyUrl='" + privacyUrl + '\'' +
                ", protectInClient=" + protectInClient +
                ", readOnly=" + readOnly +
                ", restrictedWebViewOnly=" + restrictedWebViewOnly +
                ", signoutUrl='" + signoutUrl + '\'' +
                ", supportsCoauth=" + supportsCoauth +
                ", supportsCobalt=" + supportsCobalt +
                ", supportsFolders=" + supportsFolders +
                ", supportsLocks=" + supportsLocks +
                ", supportsScenarioLinks=" + supportsScenarioLinks +
                ", supportsSecureStore=" + supportsSecureStore +
                ", tenantId='" + tenantId + '\'' +
                ", termsOfUseUrl='" + termsOfUseUrl + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", userCanAttend=" + userCanAttend +
                ", userCanNotWriteRelative=" + userCanNotWriteRelative +
                ", userCanPresent=" + userCanPresent +
                ", userFriendlyName='" + userFriendlyName + '\'' +
                ", userId='" + userId + '\'' +
                ", webEditingDisabled=" + webEditingDisabled +
                '}';
    }
}
