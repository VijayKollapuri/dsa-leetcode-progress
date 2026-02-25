class Solution {
    public String reorganizeString(String s) {
        if(s.length() == 1) return s;
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxIdx = 0;
        
        for(int i = 1; i < 26; i++) {
            if(freq[i] > freq[maxIdx]) {
                maxIdx = i;
            }
        }

        int maxFreq = freq[maxIdx];
        if (maxFreq > (s.length() + 1) / 2) return "";

        char[] ch = new char[s.length()];
        int j = 0;
        while(freq[maxIdx] > 0) {
            ch[j] = (char) (maxIdx + 'a');
            j += 2;
            freq[maxIdx]--;
            if(j >= ch.length) break;
        }

         if(j >= ch.length)
         j = 1;
         
         for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                while(freq[i] > 0) {
                    if(j >= ch.length) {
                        j = 1;
                    }
                    ch[j] = (char) (i + 'a');
                    freq[i]--;
                    j += 2;
                }
            }
         }

         return new String(ch);

    }
}
//         Map<String, Long> map =  Stream.of(s.split(""))
//                     .collect(Collectors
//                     .groupingBy(i->i, Collectors.counting()))
//                     .entrySet()
//                     .stream()
//                     .sorted(Map.Entry.comparingByValue())
//                     .sorted(Comparator.reverseOrder())
//                     .collect(Collectors.toMap(
//                         Map.Entry::getKey,
//                         Map.Entry::getValue,
//                         (a, b) -> a,
//                         LinkedHashMap::new
//                     ));
//                     System.out.println(map);
//     StringBuilder str = new StringBuilder();
//           for(Map.Entry<String, Long> m : map.entrySet()) {
//             if(m.getValue() > s.length()/2+1) return "";
//             String s1 = m.getKey();
//             long count = m.getValue();
//             while(count > 0) {
//                 str.append(s1);
//                 count--;
//             }
//           }
//           return str.toString();
//     }
// }