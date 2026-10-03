import SwiftUI
import MoneyTrackerShared

struct ContentView: View {
    @State private var netBalance: Double = 0.0

    var body: some View {
        VStack(spacing: 20) {
            Text("Money Tracker (iOS)")
                .font(.largeTitle)
                .bold()

            Text("Net Balance: ₹\(netBalance, specifier: "%.2f")")
                .font(.title2)

            Button("Calculate Balance") {
                // Example usage of shared FinancialCalculator
                let mockTransactions: [Transaction] = []
                let mockLoansDebts: [LoanDebtWithRepayments] = []
                netBalance = FinancialCalculator.shared.calculateNetBalance(
                    transactions: mockTransactions,
                    loansDebts: mockLoansDebts
                )
            }
            .buttonStyle(.borderedProminent)
        }
        .padding()
    }
}
