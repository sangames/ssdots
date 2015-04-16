/**
 * Method which reads from a text resource in to string.
 * Tried the below already but FileLocator.resolve is not working correctly, when the product is exported. Hence the 
 * code snippet has the working code.
 * URI fileURI = FileLocator.resolve(readMeURL).toURI();
 * Path path = Paths.get(fileURI);
 * String filePath = path.toString();
 */
 


class PluginResourceToString {
	private String convertResourceToString(final String filePath) {
	        URL url = FrameworkUtil.getBundle(getClass()).getEntry(filePath);
	
	        if (url != null) {
	            try {
	                InputStream inputStream = url.openStream();                
	                FileConverToString util = new FileToString();
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
