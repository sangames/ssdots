class PluginResourceToString {
	private String convertResourceToString(final String filePath) {
        URL url = FrameworkUtil.getBundle(getClass()).getEntry(filePath);

        if (url != null) {
            try {
                InputStream inputStream = url.openStream();                
                FileConverToString util = new FileConverToString();
                String readMeStr = util.convertToString(inputStream);
                return readMeStr;
            } catch (IOException e) {
                e.printStackTrace();
				return null;
            }
		} else {
			return null;
		}
	}
}