import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(home:MyApp()));


class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(
          child: TextButton(
            child: Text("Test"),
            onPressed: (){
              print("Test");
            },
          )
      ),
    );
  }
}