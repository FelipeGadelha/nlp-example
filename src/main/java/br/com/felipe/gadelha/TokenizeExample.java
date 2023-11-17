package br.com.felipe.gadelha;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import java.util.List;

public class TokenizeExample {

    public static void main(String[] args) {
        var stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! This is Felipe Gadelha";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        coreLabelList.forEach(c -> System.out.println(c.originalText()));

    }
}
