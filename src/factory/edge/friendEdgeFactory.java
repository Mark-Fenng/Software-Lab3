package factory.edge;

import edge.CommentConnection;
import edge.Edge;
import vertex.Vertex;

import java.util.List;

class friendEdgeFactory {
    static Edge createEdge(String label, List<Vertex> vertices, double weight) {
        Edge friendConnection = new CommentConnection(label, weight);
        if (vertices.get(0).equals(vertices.get(1))) {
            throw new UnsupportedOperationException("One comment connection edge can't be a loop");
        }
        friendConnection.addVertices(vertices);
        return friendConnection;
    }
}
