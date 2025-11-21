public class Codec {

    Map<Integer,String> map = new HashMap<>();
    int id = 1;
    public String encode(String longUrl) {
        map.put(id,longUrl);
        return "http://tinyurl.com/" + (id++);
    }

    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf("/")+1));
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));