class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        char in;
        String s;

        char[] stringToArray = dnaStrand.toUpperCase().toCharArray();
        
        for (int i = 0; i < stringToArray.length; i++) {
            switch (stringToArray[i]) {
                case 'G':
                    in = 'C';
                    break;
                case 'C':
                    in = 'G';
                    break;
                case 'T':
                    in = 'A';
                    break;
                case 'A':
                    in = 'U';
                    break;

                    default: throw new IllegalArgumentException("Invalid input");
            }
            rnaStrand.append(in);
        }
        s = rnaStrand.toString();
        return s;
    }

}
