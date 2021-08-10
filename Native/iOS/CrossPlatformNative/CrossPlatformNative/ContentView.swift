//
//  ContentView.swift
//  CrossPlatformNative
//
//  Created by Илья on 10.08.2021.
//

import SwiftUI

struct ContentView: View {
    
    @State private var first: String = ""
    @State private var second: String = ""
    @State private var result: String = ""
    var body: some View {
        VStack(content: {
            TextField("first", text: $first)
                .autocapitalization(.none)
                .disableAutocorrection(true)
            TextField("second", text: $second)
                .autocapitalization(.none)
                .disableAutocorrection(true)
            Button("submit") {
                result = "\(first) \(second)"
            }
            Text(result)
                .padding()
        })
    }
    
    
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        Group {
            ContentView()
        }
    }
}
