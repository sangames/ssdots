class FileConverToString {

	public final String convertToString(InputStream in) throws IOException {

        InputStreamReader is = new InputStreamReader(in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(is);
        String read = br.readLine();

        while (read != null) {
            sb.append(read);
            read = br.readLine();
            sb.append("\n");
        }
        
        is.close();
        br.close();

        return sb.toString();
    }
	
}

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