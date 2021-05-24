using lab_3_3;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace Lab_4_1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void Should_add_new_positions()
        {
            //arrange
            ActionsInvoker actions = new();
            Action<string> Akcja1 = s => { Console.WriteLine("wywo³anie \"akcja1\""); };
            Action<string> Akcja2 = s => { Console.WriteLine("wywo³anie \"akcja2\""); };
            //act
            actions.AddAction("akcja1", Akcja1);
            actions.AddAction("akcja2", Akcja2);
            //assert
            Assert.IsTrue(actions.GetNumberOfActions() == 2);
        }


        [TestMethod]
        public void ShoudAddToExitingPositions()
        {
            //arrange
            ActionsInvoker actions = new();
            Action<string> Akcja1 = s => { Console.WriteLine("wywo³anie \"akcja1\""); };
            Action<string> Akcja2 = s => { Console.WriteLine("wywo³anie \"akcja2\""); };
            //act
            actions.AddAction("akcja", Akcja1);
            actions.AddAction("akcja", Akcja2);
            //assert
            Assert.IsTrue(actions.GetNumberOfActions("akcja") == 2);
        }

        [TestMethod]
        public void ShoudRemoveSubcription()
        {
            //arrange
            ActionsInvoker actions = new();
            Action<string> Akcja1 = s => { Console.WriteLine("wywo³anie \"akcja1\""); };
            Action<string> Akcja2 = s => { Console.WriteLine("wywo³anie \"akcja2\""); };
            //act
            actions.AddAction("akcja", Akcja1);
            actions.AddAction("akcja", Akcja2);
            int test1 = actions.GetNumberOfActions("akcja");
            actions.RemoveAction("akcja", Akcja1);
            int test2 = actions.GetNumberOfActions("akcja");
            //assert
            Assert.IsTrue(test1 == 2 && test2 == 1);

        }
    }
}
