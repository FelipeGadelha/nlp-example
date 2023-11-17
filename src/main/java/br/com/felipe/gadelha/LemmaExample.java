package br.com.felipe.gadelha;

import edu.stanford.nlp.pipeline.CoreDocument;

public class LemmaExample {
    public static void main(String[] args) {
        final var stanfordCoreNLP = Pipeline.getPipeline();
        String text = "I am trying to learn new technologies.";
        final var coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        final var coreLabelList = coreDocument.tokens();

        coreLabelList.forEach(c -> System.out.println(c.originalText() + " - " + c.lemma()));


    }
}
