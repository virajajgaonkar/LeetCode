package com.ajgaonkar.leetcode;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LC388_Longest_Absolute_File_Path {
	private static final Pattern FILE_PATTERN = Pattern.compile(".*\\..*");

	private int getLevel(String path){
		if((path == null) || (path.length() == 0)){
			return 0;
		}
		char[] c = path.toCharArray();
		for (int i =0; i< c.length; i++){
			if(c[i] != '\t'){
				return i;
			}
		}
		return c.length;
	}

	private boolean isFile(String path){
		Matcher m = FILE_PATTERN.matcher(path);
		return m.matches();
	}
	public static class Path{
		private final String p;
		private final int l;
		public Path(String p, int l) {
			this.p = p;
			this.l = l;
		}
	}

	private void adjustStack(Stack<Path> s, int currentLevel){
		while ((!s.empty()) && (s.peek().l >= currentLevel)){
			s.pop();
		}
		return;
	}

	public int lengthLongestPath(String input) {
		String[] parts = input.split("\n");
		Stack<Path> s = new Stack<Path>();
		String longestPath = "";
		for(String currentPath : parts){
			int currentLevel = getLevel(currentPath);
			boolean isFile = isFile(currentPath);
			adjustStack(s, currentLevel);
			String currentPathSanitized = currentPath.replace("\t", "");


			if(!isFile){
				//Directory
				Path p = null;
				if(!s.empty()) {
					p = new Path(s.peek().p + "/" + currentPathSanitized, currentLevel);
				} else {
					p = new Path(currentPathSanitized, currentLevel);
				}
				s.push(p);
			} else {
				//File
				String filePath = "";
				if(!s.empty()){
					filePath = s.peek().p + "/" + currentPathSanitized;
				} else {
					filePath = currentPathSanitized;
				}
				if(filePath.length() > longestPath.length()){
					longestPath = filePath;
				}
			}
		}
		return longestPath.length();
	}
}
