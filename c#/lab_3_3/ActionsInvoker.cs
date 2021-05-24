using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab_3_3
{
    class ActionsInvoker
    {
        Dictionary<string, Action<string>> dictionary;

        public ActionsInvoker()
        {
            this.dictionary = new();
        }

        public void AddAction(string key, Action<string> action)
        {
            if (dictionary.ContainsKey(key))
            {
                dictionary[key] += action;
            }
            else
            {
                dictionary.Add(key, action);
            }
        }

        public void RemoveAction(string key, Action<string> action)
        {
            if (dictionary.ContainsKey(key))
            {
                dictionary[key] -= action;
                if (dictionary[key] == null)
                    dictionary.Remove(key);
            }
        }

        public void InvokeActions()
        {
            foreach (var item in dictionary)
            {
                Console.WriteLine($"for key: {item.Key}");
                item.Value("test");
                Console.WriteLine("--------------------");
            }
        }
        public void InvokeActions(string key)
        {
            if (dictionary.ContainsKey(key)){
                Console.WriteLine($"for key: {key}");
                dictionary[key]?.Invoke("test");
            }
        }
    }
}
