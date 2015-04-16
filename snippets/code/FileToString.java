class FileToString {

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
