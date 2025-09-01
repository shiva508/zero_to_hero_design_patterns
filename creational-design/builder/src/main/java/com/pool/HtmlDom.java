package com.pool;



public class HtmlDom {
    private String title;
    private String body;
    private String footer;
    private String header;
    private String sidebar;
    private String navBar;
    private String mainContent;
    private String adsSection;
    private String commentsSection;
    private String searchBar;
    private String userProfileSection;
    private String notificationSection;
    private String chatSection;
    private String settingsSection;
    private String helpSection;
    private String footerLinks;
    private String socialMediaLinks;
    private String copyrightInfo;
    private String analyticsScript;
    private String customStyles;
    private String customScripts;
    private String metaTags;
    private String favicon;

    @Override
    public String toString() {
        return "HtmlDom{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                ", header='" + header + '\'' +
                ", sidebar='" + sidebar + '\'' +
                ", navBar='" + navBar + '\'' +
                ", mainContent='" + mainContent + '\'' +
                ", adsSection='" + adsSection + '\'' +
                ", commentsSection='" + commentsSection + '\'' +
                ", searchBar='" + searchBar + '\'' +
                ", userProfileSection='" + userProfileSection + '\'' +
                ", notificationSection='" + notificationSection + '\'' +
                ", chatSection='" + chatSection + '\'' +
                ", settingsSection='" + settingsSection + '\'' +
                ", helpSection='" + helpSection + '\'' +
                ", footerLinks='" + footerLinks + '\'' +
                ", socialMediaLinks='" + socialMediaLinks + '\'' +
                ", copyrightInfo='" + copyrightInfo + '\'' +
                ", analyticsScript='" + analyticsScript + '\'' +
                ", customStyles='" + customStyles + '\'' +
                ", customScripts='" + customScripts + '\'' +
                ", metaTags='" + metaTags + '\'' +
                ", favicon='" + favicon + '\'' +
                '}';
    }

    public HtmlDom(){

    }
    public static HtmlDomBuilder builder(){
        return new HtmlDomBuilder();
    }

    public HtmlDom(HtmlDomBuilder htmlDomBuilder) {
        this.title = htmlDomBuilder.title;
        this.body = htmlDomBuilder.body;
        this.footer = htmlDomBuilder.footer;
        this.header = htmlDomBuilder.header;
        this.sidebar = htmlDomBuilder.sidebar;
        this.navBar = htmlDomBuilder.navBar;
        this.mainContent = htmlDomBuilder.mainContent;
        this.adsSection = htmlDomBuilder.adsSection;
        this.commentsSection = htmlDomBuilder.commentsSection;
        this.searchBar = htmlDomBuilder.searchBar;
        this.userProfileSection = htmlDomBuilder.userProfileSection;
        this.notificationSection = htmlDomBuilder.notificationSection;
        this.chatSection = htmlDomBuilder.chatSection;
        this.settingsSection = htmlDomBuilder.settingsSection;
        this.helpSection = htmlDomBuilder.helpSection;
        this.footerLinks = htmlDomBuilder.footerLinks;
        this.socialMediaLinks = htmlDomBuilder.socialMediaLinks;
        this.copyrightInfo = htmlDomBuilder.copyrightInfo;
        this.analyticsScript = htmlDomBuilder.analyticsScript;
        this.customStyles = htmlDomBuilder.customStyles;
        this.customScripts = htmlDomBuilder.customScripts;
        this.metaTags = htmlDomBuilder.metaTags;
        this.favicon = htmlDomBuilder.favicon;
    }

    public static class HtmlDomBuilder{
        private String title;
        private String body;
        private String footer;
        private String header;
        private String sidebar;
        private String navBar;
        private String mainContent;
        private String adsSection;
        private String commentsSection;
        private String searchBar;
        private String userProfileSection;
        private String notificationSection;
        private String chatSection;
        private String settingsSection;
        private String helpSection;
        private String footerLinks;
        private String socialMediaLinks;
        private String copyrightInfo;
        private String analyticsScript;
        private String customStyles;
        private String customScripts;
        private String metaTags;
        private String favicon;


        public HtmlDomBuilder() {
        }

        public HtmlDomBuilder title(String title){
            this.title=title;
            return this;
        }
        public HtmlDomBuilder body(String body){
            this.body=body;
            return this;
        }
        public HtmlDomBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }
        public HtmlDomBuilder header(String header) {
            this.header = header;
            return this;
        }
        public HtmlDomBuilder sidebar(String sidebar) {
            this.sidebar = sidebar;
            return this;
        }
        public HtmlDomBuilder navBar(String navBar) {
            this.navBar = navBar;
            return this;
        }
        public HtmlDomBuilder mainContent(String mainContent) {
            this.mainContent = mainContent;
            return this;
        }
        public HtmlDomBuilder adsSection(String adsSection) {
            this.adsSection = adsSection;
            return this;
        }
        public HtmlDomBuilder commentsSection(String commentsSection) {
            this.commentsSection = commentsSection;
            return this;
        }
        public HtmlDomBuilder searchBar(String searchBar) {
            this.searchBar = searchBar;
            return this;
        }
        public HtmlDomBuilder userProfileSection(String userProfileSection) {
            this.userProfileSection = userProfileSection;
            return this;
        }
        public HtmlDomBuilder notificationSection(String notificationSection) {
            this.notificationSection = notificationSection;
            return this;
        }
        public HtmlDomBuilder chatSection(String chatSection) {
            this.chatSection = chatSection;
            return this;
        }
        public HtmlDomBuilder settingsSection(String settingsSection) {
            this.settingsSection = settingsSection;
            return this;
        }
        public HtmlDomBuilder helpSection(String helpSection) {
            this.helpSection = helpSection;
            return this;
        }
        public HtmlDomBuilder footerLinks(String footerLinks) {
            this.footerLinks = footerLinks;
            return this;
        }
        public HtmlDomBuilder socialMediaLinks(String socialMediaLinks) {
            this.socialMediaLinks = socialMediaLinks;
            return this;
        }
        public HtmlDomBuilder copyrightInfo(String copyrightInfo) {
            this.copyrightInfo = copyrightInfo;
            return this;
        }
        public HtmlDomBuilder analyticsScript(String analyticsScript) {
            this.analyticsScript = analyticsScript;
            return this;
        }
        public HtmlDomBuilder customStyles(String customStyles) {
            this.customStyles = customStyles;
            return this;
        }
        public HtmlDomBuilder customScripts(String customScripts) {
            this.customScripts = customScripts;
            return this;
        }
        public HtmlDomBuilder metaTags(String metaTags) {
            this.metaTags = metaTags;
            return this;
        }
        public HtmlDomBuilder favicon(String favicon) {
            this.favicon = favicon;
            return this;
        }

        public HtmlDom build(){
            return new HtmlDom(this);
        }
        /**
         * HtmlDom.HtmlDomBuilder.build()
         */

    }
}
