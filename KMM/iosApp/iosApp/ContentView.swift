import SwiftUI
import shared

struct ContentView: View {

    @State private var first: String = ""
    @State private var second: String = ""
    @State private var result: String = ""
    
    func evaluate() {
        result = Evaluator(a: first, b: second).evaluate()
    }
    
	var body: some View {
        VStack(content: {
            TextField("first", text: $first)
            TextField("second", text: $second)
            Button("submit") {
                evaluate()
            }
            Text(result)
        })
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
