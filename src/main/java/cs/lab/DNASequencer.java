package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.HashMap;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        List<String> sequences;
        HashMap<String,Integer> HashSequence = new HashMap<String,Integer>();
        StringBuilder DNASequence = new StringBuilder();
        for(int i = 0; i < part.size();++i){
            String sequence = part.get(i);
            for( int j = 0 ;j < sequence.length();++j){
                String valueSequence = String.valueOf(sequence.charAt(j));
                HashSequence.put(j,valueSequence);
                DNASequence.append(String.valueOf(sequence.charAt(j)));
                logger.warning(String.valueOf(DNASequence));
            }
        }
        for (DNASequence:)



        return "AGATTACAGA";
    }
}
