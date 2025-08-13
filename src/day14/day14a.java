package day14;

public class day14a {
    public static void main(String[] args) {
// === CHECK OPEN POSITION ===
        async function checkPosition() {
  const res = await fetch('https://paper-api.alpaca.markets/v2/positions/BTCUSD', { headers });
            if (res.status === 404) return null;
            try {
                return await res.json();
            } catch {
                console.error("Error parsing position check response");
                return null;
            }
        }

// === CLOSE POSITION ===
        async function closePosition() {
            try {
    const res = await fetch('https://paper-api.alpaca.markets/v2/positions/BTCUSD', {
                        method: 'DELETE',
                        headers,
    });
                if (res.status === 404) {
                    console.log("No position to close.");
                    return false;
                }
    const data = await res.json();
                console.log(`🔴 Position closed:`, data.id || data.message || data);
                entryPrice = null;
                entrySide = null;
                return true;
            } catch (error) {
                console.error("Error closing position:", error.message);
                return false;
            }
        }

    }
}
