package application;

import graph.Graph;
import factory.graph.GraphTopologyFactory;

import java.io.IOException;
import java.util.Collection;

class NetworkTopologyApp {
    private Graph NetworkTopolopyApp;

    NetworkTopologyApp(String filePath) throws IOException {
        NetworkTopolopyApp = GraphTopologyFactory.createGraph(filePath);
        iterator("vertices", NetworkTopolopyApp.vertices());
//        iterator("edges", NetworkTopolopyApp.edges());
//        for (Vertex a : NetworkTopolopyApp.vertices()) {
//            iterator("sources " + a.getLabel() + " :", NetworkTopolopyApp.sources(a).keySet());
//            iterator("targets " + a.getLabel() + " :", NetworkTopolopyApp.targets(a).keySet());
//        }
    }

    private static void iterator(String title, Collection<?> a) {
        System.out.println(title);
        for (Object item : a) {
            System.out.println(item);
        }
    }
}
