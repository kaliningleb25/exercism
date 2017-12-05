class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuffer sb = new StringBuffer();
        for(String sub : this.phrase.split("\\W+")) {
            sb.append(sub.toUpperCase().charAt(0));
        }
        return sb.toString();
    }

}
